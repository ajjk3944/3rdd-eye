.class public Lorg/snmp4j/util/TableEvent;
.super Lorg/snmp4j/util/RetrievalEvent;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x2e5beca3fd2054b5L


# instance fields
.field private index:Lorg/snmp4j/smi/OID;


# direct methods
.method protected constructor <init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Ljava/util/EventListener;Ljava/lang/Object;)V

    .line 2
    iput-object p2, p0, Lorg/snmp4j/util/RetrievalEvent;->userObject:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;)V

    .line 4
    iput p3, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Ljava/lang/Exception;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;)V

    .line 6
    iput-object p3, p0, Lorg/snmp4j/util/RetrievalEvent;->exception:Ljava/lang/Exception;

    const/4 p1, -0x4

    .line 7
    iput p1, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Lorg/snmp4j/PDU;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;)V

    .line 9
    iput-object p3, p0, Lorg/snmp4j/util/RetrievalEvent;->reportPDU:Lorg/snmp4j/PDU;

    const/4 p1, -0x3

    .line 10
    iput p1, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Lorg/snmp4j/smi/OID;[Lorg/snmp4j/smi/VariableBinding;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p4}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Lorg/snmp4j/event/ResponseListener;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    .line 12
    iput-object p3, p0, Lorg/snmp4j/util/TableEvent;->index:Lorg/snmp4j/smi/OID;

    return-void
.end method


# virtual methods
.method public getColumns()[Lorg/snmp4j/smi/VariableBinding;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/RetrievalEvent;->vbs:[Lorg/snmp4j/smi/VariableBinding;

    return-object v0
.end method

.method public getIndex()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableEvent;->index:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/TableEvent;->index:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",vbs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/RetrievalEvent;->vbs:[Lorg/snmp4j/smi/VariableBinding;

    if-nez v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/util/RetrievalEvent;->vbs:[Lorg/snmp4j/smi/VariableBinding;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",exception="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/RetrievalEvent;->exception:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",report="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/RetrievalEvent;->reportPDU:Lorg/snmp4j/PDU;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
