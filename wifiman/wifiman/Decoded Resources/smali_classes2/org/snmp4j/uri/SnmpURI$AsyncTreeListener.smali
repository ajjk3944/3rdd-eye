.class Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/TreeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/uri/SnmpURI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncTreeListener"
.end annotation


# instance fields
.field private callback:Lorg/snmp4j/uri/SnmpUriCallback;

.field private volatile finished:Z

.field final synthetic this$0:Lorg/snmp4j/uri/SnmpURI;

.field private url:Ljava/net/URI;


# direct methods
.method public constructor <init>(Lorg/snmp4j/uri/SnmpURI;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->this$0:Lorg/snmp4j/uri/SnmpURI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    iput-object p2, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->url:Ljava/net/URI;

    iput-object p3, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->callback:Lorg/snmp4j/uri/SnmpUriCallback;

    return-void
.end method

.method private createResponse(Lorg/snmp4j/util/TreeEvent;)Lorg/snmp4j/uri/SnmpUriResponse;
    .locals 3

    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    sget-object v1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->TIMEOUT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-direct {v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lorg/snmp4j/util/TreeEvent;->getVariableBindings()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result p1

    new-instance v1, Lorg/snmp4j/uri/SnmpUriResponse;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Ljava/util/List;I)V

    if-nez p1, :cond_0

    sget-object p1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->NEXT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-virtual {v1, p1}, Lorg/snmp4j/uri/SnmpUriResponse;->setResponseType(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V

    :cond_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v1

    const/4 v2, -0x4

    if-ne v1, v2, :cond_2

    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    sget-object v1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->IO_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v1

    const/4 v2, -0x3

    if-ne v1, v2, :cond_4

    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    sget-object v1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->SECURITY_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getReportPDU()Lorg/snmp4j/PDU;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/PDU;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getReportPDU()Lorg/snmp4j/PDU;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/VariableBinding;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const-string p1, "<empty report PDU>"

    :goto_0
    invoke-direct {v0, v1, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result p1

    const/4 v1, -0x2

    if-ne p1, v1, :cond_5

    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    sget-object p1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->LEXICOGRAPHIC_ORDER_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-direct {v0, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V

    :cond_5
    :goto_1
    return-object v0
.end method


# virtual methods
.method public finished(Lorg/snmp4j/util/TreeEvent;)V
    .locals 3

    iget-boolean v0, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->createResponse(Lorg/snmp4j/util/TreeEvent;)Lorg/snmp4j/uri/SnmpUriResponse;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/uri/SnmpUriResponse;->getResponseType()Lorg/snmp4j/uri/SnmpUriResponse$Type;

    move-result-object v1

    sget-object v2, Lorg/snmp4j/uri/SnmpUriResponse$Type;->NEXT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    if-ne v1, v2, :cond_0

    sget-object v1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-virtual {v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;->setResponseType(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V

    :cond_0
    iget-object v1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->callback:Lorg/snmp4j/uri/SnmpUriCallback;

    iget-object v2, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->url:Ljava/net/URI;

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getUserObject()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v0, v2, p1}, Lorg/snmp4j/uri/SnmpUriCallback;->onResponse(Lorg/snmp4j/uri/SnmpUriResponse;Ljava/net/URI;Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    :cond_1
    return-void
.end method

.method public isFinished()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    return v0
.end method

.method public next(Lorg/snmp4j/util/TreeEvent;)Z
    .locals 4

    iget-boolean v0, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->createResponse(Lorg/snmp4j/util/TreeEvent;)Lorg/snmp4j/uri/SnmpUriResponse;

    move-result-object v0

    iget-boolean v1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    iget-object v2, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->callback:Lorg/snmp4j/uri/SnmpUriCallback;

    iget-object v3, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->url:Ljava/net/URI;

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getUserObject()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v2, v0, v3, p1}, Lorg/snmp4j/uri/SnmpUriCallback;->onResponse(Lorg/snmp4j/uri/SnmpUriResponse;Ljava/net/URI;Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p1, v1

    iput-boolean p1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    :cond_0
    iget-boolean p1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;->finished:Z

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
