.class public Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/ArgumentParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArgumentFormat"
.end annotation


# instance fields
.field private mandatory:Z

.field private option:Ljava/lang/String;

.field private parameter:Z

.field private params:[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

.field private vararg:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->vararg:Z

    return p1
.end method

.method static synthetic access$100(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->parameter:Z

    return p0
.end method

.method static synthetic access$102(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->parameter:Z

    return p1
.end method

.method static synthetic access$202(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->mandatory:Z

    return p1
.end method

.method static synthetic access$300(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->option:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$302(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->option:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$702(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->params:[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    return-object p1
.end method


# virtual methods
.method public getOption()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->option:Ljava/lang/String;

    return-object v0
.end method

.method public getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->params:[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    return-object v0
.end method

.method public isMandatory()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->mandatory:Z

    return v0
.end method

.method public isParameter()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->parameter:Z

    return v0
.end method

.method public isVariableLength()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->vararg:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ArgumentFormat[option="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->option:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",parameter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->parameter:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",vararg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->vararg:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",mandatatory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->mandatory:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",parameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->params:[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    if-nez v1, :cond_0

    const-string v1, "<null>"

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
