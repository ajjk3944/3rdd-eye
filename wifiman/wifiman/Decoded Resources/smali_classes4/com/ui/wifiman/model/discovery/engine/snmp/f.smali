.class public final synthetic Lcom/ui/wifiman/model/discovery/engine/snmp/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/event/ResponseListener;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

.field public final synthetic b:Lgg/j;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lgg/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/f;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/f;->b:Lgg/j;

    return-void
.end method


# virtual methods
.method public final onResponse(Lorg/snmp4j/event/ResponseEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/f;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/c;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/f;->b:Lgg/j;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->c(Lcom/ui/wifiman/model/discovery/engine/snmp/c;Lgg/j;Lorg/snmp4j/event/ResponseEvent;)V

    return-void
.end method
