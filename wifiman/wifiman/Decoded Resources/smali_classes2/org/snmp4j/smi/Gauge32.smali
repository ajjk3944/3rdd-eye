.class public Lorg/snmp4j/smi/Gauge32;
.super Lorg/snmp4j/smi/UnsignedInteger32;
.source "SourceFile"


# static fields
.field static final serialVersionUID:J = 0x1464f941bd670a45L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>()V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>(J)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lorg/snmp4j/smi/Gauge32;

    iget-wide v1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/Gauge32;-><init>(J)V

    return-object v0
.end method

.method public getSyntax()I
    .locals 1

    const/16 v0, 0x42

    return v0
.end method
