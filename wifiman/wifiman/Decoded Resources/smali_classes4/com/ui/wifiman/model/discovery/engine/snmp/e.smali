.class public final synthetic Lcom/ui/wifiman/model/discovery/engine/snmp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/N;

.field public final synthetic b:Lkotlin/jvm/internal/N;

.field public final synthetic c:Lorg/snmp4j/Snmp;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lorg/snmp4j/Snmp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/e;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/e;->b:Lkotlin/jvm/internal/N;

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/e;->c:Lorg/snmp4j/Snmp;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/e;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/e;->b:Lkotlin/jvm/internal/N;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/e;->c:Lorg/snmp4j/Snmp;

    invoke-static {v0, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/snmp/c$c;->a(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lorg/snmp4j/Snmp;)V

    return-void
.end method
