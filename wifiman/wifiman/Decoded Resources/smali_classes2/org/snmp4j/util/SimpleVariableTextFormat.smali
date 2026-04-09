.class public Lorg/snmp4j/util/SimpleVariableTextFormat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/VariableTextFormat;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public format(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;Z)Ljava/lang/String;
    .locals 1

    if-eqz p3, :cond_0

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getOIDTextFormat()Lorg/snmp4j/util/OIDTextFormat;

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/util/OIDTextFormat;->format([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " = "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lorg/snmp4j/smi/Variable;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public parse(ILjava/lang/String;)Lorg/snmp4j/smi/Variable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lorg/snmp4j/smi/AbstractVariable;->createFromSyntax(I)Lorg/snmp4j/smi/Variable;

    move-result-object p1

    .line 2
    instance-of v0, p1, Lorg/snmp4j/smi/AssignableFromString;

    if-eqz v0, :cond_0

    .line 3
    move-object v0, p1

    check-cast v0, Lorg/snmp4j/smi/AssignableFromString;

    invoke-interface {v0, p2}, Lorg/snmp4j/smi/AssignableFromString;->setValue(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public parse(Lorg/snmp4j/smi/OID;Ljava/lang/String;)Lorg/snmp4j/smi/Variable;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public parseVariableBinding(Ljava/lang/String;)Lorg/snmp4j/smi/VariableBinding;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    const-string v0, " = "

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    new-instance v2, Lorg/snmp4j/smi/OID;

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getOIDTextFormat()Lorg/snmp4j/util/OIDTextFormat;

    move-result-object v3

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Lorg/snmp4j/util/OIDTextFormat;->parse(Ljava/lang/String;)[I

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lorg/snmp4j/util/SimpleVariableTextFormat;->parse(Lorg/snmp4j/smi/OID;Ljava/lang/String;)Lorg/snmp4j/smi/Variable;

    move-result-object p1

    new-instance v0, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v0, v2, p1}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/text/ParseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not locate assignment \' = \' string in \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method
