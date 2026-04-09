.class final Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/b;->e(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentHashMap;Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 13

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;->c()Linet/ipaddr/g;

    move-result-object v2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    move-object v5, v0

    goto :goto_2

    :cond_2
    move-object v5, v1

    :goto_2
    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, v1

    :goto_3
    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    move-object v7, v0

    goto :goto_4

    :cond_4
    move-object v7, v1

    :goto_4
    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;->f()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-static {p2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object v8, p2

    goto :goto_5

    :cond_5
    move-object v8, v1

    :goto_5
    const-wide/32 v0, 0xea60

    add-long v11, v9, v0

    new-instance p2, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    move-object v1, p2

    invoke-direct/range {v1 .. v12}, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;-><init>(Linet/ipaddr/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    invoke-virtual {p2}, LEc/t$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    check-cast p2, Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;->a(Ljava/util/concurrent/ConcurrentHashMap;Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp$a;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    return-object p1
.end method
