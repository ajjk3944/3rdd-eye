.class public final Lcom/ui/wifiman/model/discovery/engine/snmp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/discovery/engine/snmp/c$a;,
        Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;
    }
.end annotation


# static fields
.field public static final e:Lcom/ui/wifiman/model/discovery/engine/snmp/c$a;


# instance fields
.field private final a:Lgg/y;

.field private final b:Lgg/y;

.field private final c:Lorg/snmp4j/PDU;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->e:Lcom/ui/wifiman/model/discovery/engine/snmp/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm9/c;->a:Lm9/c;

    const-wide/16 v1, 0x1388

    const-string v3, "Snmp"

    const/4 v4, 0x1

    invoke-virtual {v0, v4, v1, v2, v3}, Lm9/c;->e(IJLjava/lang/String;)Lgg/y;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->a:Lgg/y;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const-string v1, "computation(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->b:Lgg/y;

    invoke-static {}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getEntries()Lfh/a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getOidWithInterface()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/smi/OID;

    new-instance v3, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v3, v2}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Lorg/snmp4j/PDU;

    const/16 v2, -0x60

    invoke-direct {v1, v2, v0}, Lorg/snmp4j/PDU;-><init>(ILjava/util/List;)V

    iput-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->c:Lorg/snmp4j/PDU;

    new-instance v0, LOc/c;

    invoke-direct {v0}, LOc/c;-><init>()V

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, v1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->a:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->d:Lgg/i;

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->k(Lkotlin/jvm/internal/N;)V

    return-void
.end method

.method public static synthetic c(Lgg/j;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->j(Lgg/j;)V

    return-void
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/event/ResponseEvent;)Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->g(Lorg/snmp4j/event/ResponseEvent;)Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/discovery/engine/snmp/c;)Lorg/snmp4j/PDU;
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->h()Lorg/snmp4j/PDU;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Linet/ipaddr/g;J)Lorg/snmp4j/Target;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->i(Linet/ipaddr/g;J)Lorg/snmp4j/Target;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lorg/snmp4j/event/ResponseEvent;)Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;
    .locals 11

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object v0

    instance-of v1, v0, Lorg/snmp4j/smi/TransportIpAddress;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lorg/snmp4j/smi/TransportIpAddress;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v4

    if-nez v4, :cond_1

    goto/16 :goto_7

    :cond_1
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->deviceName:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getOidWithInterface()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v5, v2

    :goto_1
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->description:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getOidWithInterface()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    move-object v6, v0

    goto :goto_2

    :cond_3
    move-object v6, v2

    :goto_2
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->uptime:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getOidWithInterface()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    move-object v7, v0

    goto :goto_3

    :cond_4
    move-object v7, v2

    :goto_3
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->contact:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getOidWithInterface()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    move-object v8, v0

    goto :goto_4

    :cond_5
    move-object v8, v2

    :goto_4
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->location:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getOidWithInterface()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    move-object v9, v0

    goto :goto_5

    :cond_6
    move-object v9, v2

    :goto_5
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->services:Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$b;->getOidWithInterface()Lorg/snmp4j/smi/OID;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    move-object v10, p1

    goto :goto_6

    :cond_7
    move-object v10, v2

    :goto_6
    new-instance p1, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;-><init>(Linet/ipaddr/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_8
    :goto_7
    return-object v2
.end method

.method private final h()Lorg/snmp4j/PDU;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->c:Lorg/snmp4j/PDU;

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.snmp4j.PDU"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/snmp4j/PDU;

    return-object v0
.end method

.method private final i(Linet/ipaddr/g;J)Lorg/snmp4j/Target;
    .locals 4

    new-instance v0, Lorg/snmp4j/CommunityTarget;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v2, "udp:%1$s/161"

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "format(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lorg/snmp4j/smi/GenericAddress;->parse(Ljava/lang/String;)Lorg/snmp4j/smi/Address;

    move-result-object p1

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    const-string v3, "public"

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, p1, v2}, Lorg/snmp4j/CommunityTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    invoke-virtual {v0, p2, p3}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    return-object v0
.end method

.method private static final j(Lgg/j;)V
    .locals 4

    const-string v0, "SNMP"

    const-string v1, "emitter"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, LOc/b;

    invoke-direct {v2, v1}, LOc/b;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-interface {p0, v2}, Lgg/j;->d(Lkg/e;)V

    :try_start_0
    const-string v2, "SNMP Client creating transport mapping"

    invoke-static {v2, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-direct {v2}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v3, "SNMP Client creating"

    invoke-static {v3, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lorg/snmp4j/Snmp;

    invoke-direct {v3, v2}, Lorg/snmp4j/Snmp;-><init>(Lorg/snmp4j/TransportMapping;)V

    iput-object v3, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const-string v3, "SNMP Client created"

    invoke-static {v3, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    const-string v3, "SNMP Client transport thread starting"

    invoke-static {v3, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listen()V

    const-string v2, "SNMP Client transport thread started"

    invoke-static {v2, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {p0, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;

    const-string v2, "Failed to start listener thread"

    invoke-direct {v1, v2, v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p0, v1}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    return-void

    :catch_1
    move-exception v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;

    const-string v2, "Failed instantiate SNMP transport mapping"

    invoke-direct {v1, v2, v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p0, v1}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private static final k(Lkotlin/jvm/internal/N;)V
    .locals 2

    const-string v0, "SNMP"

    :try_start_0
    const-string v1, "SNMP Client closing"

    invoke-static {v1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Lorg/snmp4j/Snmp;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/Snmp;->close()V

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const-string p0, "SNMP Client closed"

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v1, "SNMP Client close failed"

    invoke-static {v1, p0, v0}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_2
    return-void
.end method


# virtual methods
.method public a(Linet/ipaddr/g;J)Lgg/i;
    .locals 2

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->d:Lgg/i;

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;-><init>(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Linet/ipaddr/g;J)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    iget-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->a:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/i;->g2(Lgg/y;)Lgg/i;

    move-result-object p1

    iget-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->b:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
