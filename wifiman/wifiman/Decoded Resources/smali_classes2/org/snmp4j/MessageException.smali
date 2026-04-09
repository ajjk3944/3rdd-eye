.class public Lorg/snmp4j/MessageException;
.super Ljava/io/IOException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x62efd9f7e7da65d1L


# instance fields
.field private snmp4jErrorStatus:I

.field private statusInformation:Lorg/snmp4j/mp/StatusInformation;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    iput p2, p0, Lorg/snmp4j/MessageException;->snmp4jErrorStatus:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Throwable;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    iput p2, p0, Lorg/snmp4j/MessageException;->snmp4jErrorStatus:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/mp/StatusInformation;)V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/mp/StatusInformation;->getErrorIndication()Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Lorg/snmp4j/MessageException;->setStatusInformation(Lorg/snmp4j/mp/StatusInformation;)V

    return-void
.end method


# virtual methods
.method public getSnmp4jErrorStatus()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/MessageException;->snmp4jErrorStatus:I

    return v0
.end method

.method public getStatusInformation()Lorg/snmp4j/mp/StatusInformation;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/MessageException;->statusInformation:Lorg/snmp4j/mp/StatusInformation;

    return-object v0
.end method

.method public setStatusInformation(Lorg/snmp4j/mp/StatusInformation;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/MessageException;->statusInformation:Lorg/snmp4j/mp/StatusInformation;

    return-void
.end method
