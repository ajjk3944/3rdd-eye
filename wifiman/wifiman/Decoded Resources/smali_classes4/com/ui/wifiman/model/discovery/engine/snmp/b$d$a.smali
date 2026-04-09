.class final Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/b$d;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/snmp/b;

.field final synthetic b:Linet/ipaddr/g;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/snmp/b;Linet/ipaddr/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;->b:Linet/ipaddr/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)LDj/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b;

    invoke-static {p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->d(Lcom/ui/wifiman/model/discovery/engine/snmp/b;)Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;->b:Linet/ipaddr/g;

    const-wide/16 v1, 0x2710

    invoke-interface {p1, v0, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;->a(Linet/ipaddr/g;J)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$a;

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v0}, Lgg/i;->P1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a$b;

    invoke-virtual {p1, v0}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;->a(Ljava/lang/Long;)LDj/a;

    move-result-object p1

    return-object p1
.end method
