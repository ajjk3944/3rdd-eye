.class public Lorg/snmp4j/smi/VariantVariable;
.super Lorg/snmp4j/smi/AbstractVariable;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/AssignableFromInteger;
.implements Lorg/snmp4j/smi/AssignableFromLong;
.implements Lorg/snmp4j/smi/AssignableFromString;
.implements Lorg/snmp4j/smi/AssignableFromByteArray;


# static fields
.field private static final serialVersionUID:J = -0x330ce315e54f9dd4L


# instance fields
.field private callback:Lorg/snmp4j/smi/VariantVariableCallback;

.field private variable:Lorg/snmp4j/smi/Variable;


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/Variable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/Variable;Lorg/snmp4j/smi/VariantVariableCallback;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lorg/snmp4j/smi/VariantVariable;-><init>(Lorg/snmp4j/smi/Variable;)V

    .line 5
    iput-object p2, p0, Lorg/snmp4j/smi/VariantVariable;->callback:Lorg/snmp4j/smi/VariantVariableCallback;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    new-instance v0, Lorg/snmp4j/smi/VariantVariable;

    iget-object v1, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v1}, Lorg/snmp4j/smi/Variable;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/Variable;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/VariantVariable;-><init>(Lorg/snmp4j/smi/Variable;)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/VariantVariable;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public declared-synchronized compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    .line 3
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/Variable;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0, p1}, Lorg/snmp4j/asn1/BERSerializable;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->variableUpdated()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized encodeBER(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0, p1}, Lorg/snmp4j/asn1/BERSerializable;->encodeBER(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized equals(Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/Variable;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0, p1, p2}, Lorg/snmp4j/smi/Variable;->fromSubIndex(Lorg/snmp4j/smi/OID;Z)V

    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->variableUpdated()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized getBERLength()I
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/asn1/BERSerializable;->getBERLength()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getSyntax()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->getSyntax()I

    move-result v0

    return v0
.end method

.method public getVariable()Lorg/snmp4j/smi/Variable;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    return-object v0
.end method

.method public declared-synchronized hashCode()I
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->hashCode()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public isDynamic()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public declared-synchronized setValue(I)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    instance-of v1, v0, Lorg/snmp4j/smi/AssignableFromInteger;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lorg/snmp4j/smi/AssignableFromInteger;

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/AssignableFromInteger;->setValue(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 4
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/ClassCastException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An integer value cannot be assigned to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setValue(J)V
    .locals 2

    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    instance-of v1, v0, Lorg/snmp4j/smi/AssignableFromLong;

    if-eqz v1, :cond_0

    .line 6
    check-cast v0, Lorg/snmp4j/smi/AssignableFromLong;

    invoke-interface {v0, p1, p2}, Lorg/snmp4j/smi/AssignableFromLong;->setValue(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 8
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/ClassCastException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "A long value cannot be assigned to "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setValue(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 17
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    instance-of v1, v0, Lorg/snmp4j/smi/AssignableFromString;

    if-eqz v1, :cond_0

    .line 18
    check-cast v0, Lorg/snmp4j/smi/AssignableFromString;

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/AssignableFromString;->setValue(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 20
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/ClassCastException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A string value cannot be assigned to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setValue(Lorg/snmp4j/smi/OctetString;)V
    .locals 2

    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    instance-of v1, v0, Lorg/snmp4j/smi/AssignableFromByteArray;

    if-eqz v1, :cond_0

    .line 10
    check-cast v0, Lorg/snmp4j/smi/AssignableFromByteArray;

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/AssignableFromByteArray;->setValue([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 12
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/ClassCastException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An OctetString value cannot be assigned to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setValue([B)V
    .locals 2

    monitor-enter p0

    .line 13
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    instance-of v1, v0, Lorg/snmp4j/smi/AssignableFromByteArray;

    if-eqz v1, :cond_0

    .line 14
    check-cast v0, Lorg/snmp4j/smi/AssignableFromByteArray;

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/AssignableFromByteArray;->setValue([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 16
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/ClassCastException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A byte array value cannot be assigned to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized toByteArray()[B
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    instance-of v1, v0, Lorg/snmp4j/smi/AssignableFromByteArray;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/snmp4j/smi/AssignableFromByteArray;

    invoke-interface {v0}, Lorg/snmp4j/smi/AssignableFromByteArray;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized toInt()I
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->toInt()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized toLong()J
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->toLong()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/VariantVariable;->updateVariable()V

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->variable:Lorg/snmp4j/smi/Variable;

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/Variable;->toSubIndex(Z)Lorg/snmp4j/smi/OID;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected updateVariable()V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->callback:Lorg/snmp4j/smi/VariantVariableCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lorg/snmp4j/smi/VariantVariableCallback;->updateVariable(Lorg/snmp4j/smi/VariantVariable;)V

    :cond_0
    return-void
.end method

.method protected variableUpdated()V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/VariantVariable;->callback:Lorg/snmp4j/smi/VariantVariableCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lorg/snmp4j/smi/VariantVariableCallback;->variableUpdated(Lorg/snmp4j/smi/VariantVariable;)V

    :cond_0
    return-void
.end method
