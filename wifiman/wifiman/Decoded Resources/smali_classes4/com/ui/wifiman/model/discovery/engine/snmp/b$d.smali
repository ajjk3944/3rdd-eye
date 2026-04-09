.class final Lcom/ui/wifiman/model/discovery/engine/snmp/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/b;-><init>(LZc/f;Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/snmp/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/snmp/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/g;

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x2710

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Lgg/i;->F0(JJLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d$a;-><init>(Lcom/ui/wifiman/model/discovery/engine/snmp/b;Linet/ipaddr/g;)V

    invoke-virtual {v0, v1}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "SNMP discovery not initiated since broadcast address unavailable"

    const-string v0, "SnmpDiscEngine"

    invoke-static {p1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
