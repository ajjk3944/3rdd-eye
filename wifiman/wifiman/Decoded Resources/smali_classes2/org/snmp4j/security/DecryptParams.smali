.class public Lorg/snmp4j/security/DecryptParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public array:[B

.field public length:I

.field public offset:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lorg/snmp4j/security/DecryptParams;->array:[B

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lorg/snmp4j/security/DecryptParams;->offset:I

    .line 8
    iput v0, p0, Lorg/snmp4j/security/DecryptParams;->length:I

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/snmp4j/security/DecryptParams;->array:[B

    .line 3
    iput p2, p0, Lorg/snmp4j/security/DecryptParams;->offset:I

    .line 4
    iput p3, p0, Lorg/snmp4j/security/DecryptParams;->length:I

    return-void
.end method


# virtual methods
.method public setValues([BII)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/DecryptParams;->array:[B

    iput p2, p0, Lorg/snmp4j/security/DecryptParams;->offset:I

    iput p3, p0, Lorg/snmp4j/security/DecryptParams;->length:I

    return-void
.end method
