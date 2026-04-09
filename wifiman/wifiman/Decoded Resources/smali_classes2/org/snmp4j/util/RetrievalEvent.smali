.class public abstract Lorg/snmp4j/util/RetrievalEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field public static final STATUS_EXCEPTION:I = -0x4

.field public static final STATUS_OK:I = 0x0

.field public static final STATUS_REPORT:I = -0x3

.field public static final STATUS_TIMEOUT:I = -0x1

.field public static final STATUS_WRONG_ORDER:I = -0x2


# instance fields
.field protected exception:Ljava/lang/Exception;

.field protected reportPDU:Lorg/snmp4j/PDU;

.field protected status:I

.field protected userObject:Ljava/lang/Object;

.field protected vbs:[Lorg/snmp4j/smi/VariableBinding;


# direct methods
.method protected constructor <init>(Ljava/util/EventListener;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    .line 3
    iput-object p2, p0, Lorg/snmp4j/util/RetrievalEvent;->userObject:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/event/ResponseListener;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Ljava/util/EventListener;Ljava/lang/Object;)V

    .line 13
    iput-object p3, p0, Lorg/snmp4j/util/RetrievalEvent;->vbs:[Lorg/snmp4j/smi/VariableBinding;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Ljava/util/EventListener;Ljava/lang/Object;)V

    .line 5
    iput p3, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Ljava/lang/Exception;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Ljava/util/EventListener;Ljava/lang/Object;)V

    .line 7
    iput-object p3, p0, Lorg/snmp4j/util/RetrievalEvent;->exception:Ljava/lang/Exception;

    const/4 p1, -0x4

    .line 8
    iput p1, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Lorg/snmp4j/PDU;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Ljava/util/EventListener;Ljava/lang/Object;)V

    .line 10
    iput-object p3, p0, Lorg/snmp4j/util/RetrievalEvent;->reportPDU:Lorg/snmp4j/PDU;

    const/4 p1, -0x3

    .line 11
    iput p1, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    return-void
.end method


# virtual methods
.method public getErrorMessage()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    const/4 v1, -0x4

    if-eq v0, v1, :cond_3

    const/4 v1, -0x3

    if-eq v0, v1, :cond_2

    const/4 v1, -0x2

    if-eq v0, v1, :cond_1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Lorg/snmp4j/PDU;->toErrorStatusText(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Request timed out."

    return-object v0

    :cond_1
    const-string v0, "Agent did not return variable bindings in lexicographic order."

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Report: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/RetrievalEvent;->reportPDU:Lorg/snmp4j/PDU;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v0, p0, Lorg/snmp4j/util/RetrievalEvent;->exception:Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/RetrievalEvent;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public getReportPDU()Lorg/snmp4j/PDU;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/RetrievalEvent;->reportPDU:Lorg/snmp4j/PDU;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    return v0
.end method

.method public getUserObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/RetrievalEvent;->userObject:Ljava/lang/Object;

    return-object v0
.end method

.method public isError()Z
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
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

    const-string v1, "[vbs="

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
