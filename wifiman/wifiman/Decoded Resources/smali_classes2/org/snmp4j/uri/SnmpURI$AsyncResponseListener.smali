.class Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/event/ResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/uri/SnmpURI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncResponseListener"
.end annotation


# instance fields
.field private callback:Lorg/snmp4j/uri/SnmpUriCallback;

.field final synthetic this$0:Lorg/snmp4j/uri/SnmpURI;

.field private url:Ljava/net/URI;


# direct methods
.method private constructor <init>(Lorg/snmp4j/uri/SnmpURI;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;->this$0:Lorg/snmp4j/uri/SnmpURI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;->url:Ljava/net/URI;

    .line 4
    iput-object p3, p0, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;->callback:Lorg/snmp4j/uri/SnmpUriCallback;

    return-void
.end method

.method synthetic constructor <init>(Lorg/snmp4j/uri/SnmpURI;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;Lorg/snmp4j/uri/SnmpURI$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;-><init>(Lorg/snmp4j/uri/SnmpURI;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;)V

    return-void
.end method


# virtual methods
.method public onResponse(Lorg/snmp4j/event/ResponseEvent;)V
    .locals 3

    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    sget-object v1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->TIMEOUT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-direct {v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    invoke-virtual {v1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v1

    invoke-direct {v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    invoke-virtual {v1}, Lorg/snmp4j/PDU;->getVariableBindings()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v1}, Lorg/snmp4j/PDU;->size()I

    move-result v1

    new-array v1, v1, [Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Ljava/util/List;)V

    :cond_1
    :goto_0
    iget-object v1, p0, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;->callback:Lorg/snmp4j/uri/SnmpUriCallback;

    iget-object v2, p0, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;->url:Ljava/net/URI;

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getUserObject()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v0, v2, p1}, Lorg/snmp4j/uri/SnmpUriCallback;->onResponse(Lorg/snmp4j/uri/SnmpUriResponse;Ljava/net/URI;Ljava/lang/Object;)Z

    return-void
.end method
