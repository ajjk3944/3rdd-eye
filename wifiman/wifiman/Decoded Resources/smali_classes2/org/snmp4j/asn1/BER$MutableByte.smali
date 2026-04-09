.class public Lorg/snmp4j/asn1/BER$MutableByte;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/asn1/BER;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MutableByte"
.end annotation


# instance fields
.field value:B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-byte v0, p0, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    .line 5
    invoke-virtual {p0, p1}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    return-void
.end method


# virtual methods
.method public getValue()B
    .locals 1

    iget-byte v0, p0, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    return v0
.end method

.method public setValue(B)V
    .locals 0

    iput-byte p1, p0, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    return-void
.end method
