.class final Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/c;->a(Linet/ipaddr/g;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

.field final synthetic b:Linet/ipaddr/g;

.field final synthetic c:J


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Linet/ipaddr/g;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->b:Linet/ipaddr/g;

    iput-wide p3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lorg/snmp4j/Snmp;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->f(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lorg/snmp4j/Snmp;)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/Snmp;Linet/ipaddr/g;JLgg/j;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->e(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/Snmp;Linet/ipaddr/g;JLgg/j;)V

    return-void
.end method

.method public static synthetic c(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lgg/j;Lorg/snmp4j/event/ResponseEvent;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->g(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lgg/j;Lorg/snmp4j/event/ResponseEvent;)V

    return-void
.end method

.method private static final e(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/Snmp;Linet/ipaddr/g;JLgg/j;)V
    .locals 3

    const-string v0, "emitter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/snmp/e;

    invoke-direct {v2, v1, v0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/e;-><init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lorg/snmp4j/Snmp;)V

    invoke-interface {p5, v2}, Lgg/j;->d(Lkg/e;)V

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/snmp/f;

    invoke-direct {v2, p0, p5}, Lcom/ui/wifiman/model/discovery/engine/snmp/f;-><init>(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lgg/j;)V

    iput-object v2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->e(Lcom/ui/wifiman/model/discovery/engine/snmp/c;)Lorg/snmp4j/PDU;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, p2, p3, p4}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->f(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Linet/ipaddr/g;J)Lorg/snmp4j/Target;

    move-result-object p0

    iget-object p2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p2, Lorg/snmp4j/event/ResponseListener;

    invoke-virtual {p1, v2, p0, v1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p0, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;

    const-string p1, "Failed to send snmp request"

    const/4 p2, 0x2

    invoke-direct {p0, p1, v1, p2, v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$Error$Internal;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p5, p0}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private static final f(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lorg/snmp4j/Snmp;)V
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz p0, :cond_0

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz p1, :cond_0

    :try_start_0
    check-cast p0, Lorg/snmp4j/PDU;

    check-cast p1, Lorg/snmp4j/event/ResponseListener;

    invoke-virtual {p2, p0, p1}, Lorg/snmp4j/Snmp;->cancel(Lorg/snmp4j/PDU;Lorg/snmp4j/event/ResponseListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "Failed to cancel snmp request"

    const-string p2, "SNMP"

    invoke-static {p1, p0, p2}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private static final g(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lgg/j;Lorg/snmp4j/event/ResponseEvent;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-static {p0, p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c;->d(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/event/ResponseEvent;)Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/snmp4j/Snmp;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->d(Lorg/snmp4j/Snmp;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lorg/snmp4j/Snmp;)LDj/a;
    .locals 7

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    iget-object v4, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->b:Linet/ipaddr/g;

    iget-wide v5, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->c:J

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/ui/wifiman/model/discovery/engine/snmp/d;-><init>(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/Snmp;Linet/ipaddr/g;J)V

    sget-object p1, Lgg/a;->BUFFER:Lgg/a;

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
