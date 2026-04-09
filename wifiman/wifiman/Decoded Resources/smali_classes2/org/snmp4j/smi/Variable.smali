.class public interface abstract Lorg/snmp4j/smi/Variable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/lang/Comparable;
.implements Lorg/snmp4j/asn1/BERSerializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;",
        "Ljava/lang/Comparable<",
        "Lorg/snmp4j/smi/Variable;",
        ">;",
        "Lorg/snmp4j/asn1/BERSerializable;"
    }
.end annotation


# static fields
.field public static final serialVersionUID:J = 0x135f05c4f032ae88L


# virtual methods
.method public abstract clone()Ljava/lang/Object;
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-interface {p0, p1}, Lorg/snmp4j/smi/Variable;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public abstract compareTo(Lorg/snmp4j/smi/Variable;)I
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
.end method

.method public abstract getSyntax()I
.end method

.method public abstract getSyntaxString()Ljava/lang/String;
.end method

.method public abstract hashCode()I
.end method

.method public abstract isDynamic()Z
.end method

.method public abstract isException()Z
.end method

.method public abstract toInt()I
.end method

.method public abstract toLong()J
.end method

.method public abstract toString()Ljava/lang/String;
.end method

.method public abstract toSubIndex(Z)Lorg/snmp4j/smi/OID;
.end method
