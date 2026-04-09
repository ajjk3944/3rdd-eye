.class public Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;
.super Ljava/text/ParseException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/ArgumentParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArgumentParseException"
.end annotation


# instance fields
.field private parameterFormat:Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

.field private parameterFormatDetail:Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid value \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' at position "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_0
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mandatory parameter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "<unknown>"

    if-nez p3, :cond_1

    move-object v2, v1

    goto :goto_0

    .line 2
    :cond_1
    invoke-virtual {p3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p4, :cond_2

    goto :goto_1

    .line 3
    :cond_2
    invoke-virtual {p4}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") not specified"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    :goto_2
    invoke-direct {p0, v0, p1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 5
    iput-object p3, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->parameterFormat:Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    .line 6
    iput-object p4, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->parameterFormatDetail:Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    .line 7
    iput-object p2, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->value:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 9
    iput-object p4, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->parameterFormat:Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    .line 10
    iput-object p5, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->parameterFormatDetail:Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    .line 11
    iput-object p3, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getParameterFormat()Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->parameterFormat:Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    return-object v0
.end method

.method public getParameterFormatDetail()Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->parameterFormatDetail:Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;->value:Ljava/lang/String;

    return-object v0
.end method
