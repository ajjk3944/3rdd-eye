.class public Lorg/snmp4j/smi/SubIndexInfoImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/SubIndexInfo;


# instance fields
.field private impliedLength:Z

.field private maxLength:I

.field private minLength:I

.field private snmpSyntax:I


# direct methods
.method public constructor <init>(ZIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->impliedLength:Z

    iput p3, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->maxLength:I

    iput p2, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->minLength:I

    iput p4, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->snmpSyntax:I

    return-void
.end method


# virtual methods
.method public getMaxLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->maxLength:I

    return v0
.end method

.method public getMinLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->minLength:I

    return v0
.end method

.method public getSnmpSyntax()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->snmpSyntax:I

    return v0
.end method

.method public hasImpliedLength()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/smi/SubIndexInfoImpl;->impliedLength:Z

    return v0
.end method
