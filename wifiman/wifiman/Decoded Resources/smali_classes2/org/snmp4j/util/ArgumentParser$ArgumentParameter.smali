.class public Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/ArgumentParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArgumentParameter"
.end annotation


# instance fields
.field private defaultValue:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private pattern:Ljava/util/regex/Pattern;

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$402(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->name:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$500(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)Ljava/util/regex/Pattern;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->pattern:Ljava/util/regex/Pattern;

    return-object p0
.end method

.method static synthetic access$502(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/util/regex/Pattern;)Ljava/util/regex/Pattern;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->pattern:Ljava/util/regex/Pattern;

    return-object p1
.end method

.method static synthetic access$602(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;I)I
    .locals 0

    iput p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->type:I

    return p1
.end method

.method static synthetic access$802(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->defaultValue:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public getDefaultValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->defaultValue:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->type:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ArgumentParameter[name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",patttern="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->pattern:Ljava/util/regex/Pattern;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",defaultValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->defaultValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
