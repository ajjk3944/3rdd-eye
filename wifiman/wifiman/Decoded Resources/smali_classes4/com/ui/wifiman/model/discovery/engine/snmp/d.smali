.class public final synthetic Lcom/ui/wifiman/model/discovery/engine/snmp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

.field public final synthetic b:Lorg/snmp4j/Snmp;

.field public final synthetic c:Linet/ipaddr/g;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/Snmp;Linet/ipaddr/g;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->b:Lorg/snmp4j/Snmp;

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->c:Linet/ipaddr/g;

    iput-wide p4, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->d:J

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->b:Lorg/snmp4j/Snmp;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->c:Linet/ipaddr/g;

    iget-wide v3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/d;->d:J

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->b(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lorg/snmp4j/Snmp;Linet/ipaddr/g;JLgg/j;)V

    return-void
.end method
