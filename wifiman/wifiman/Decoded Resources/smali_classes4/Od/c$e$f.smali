.class final LOd/c$e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/c$e;->b(LPd/d;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LOd/c;


# direct methods
.method constructor <init>(LOd/c;)V
    .locals 0

    iput-object p1, p0, LOd/c$e$f;->a:LOd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)LOd/a;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->e()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;->TELEPORT_NCA_API:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, LOd/c$e$f;->a:LOd/c;

    invoke-static {v2, v0}, LOd/c;->c(LOd/c;Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;)LOd/a$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->e()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;->SPEEDTEST:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, LOd/c$e$f;->a:LOd/c;

    invoke-static {v3, v2}, LOd/c;->c(LOd/c;Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;)LOd/a$b;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->e()Ljava/util/Map;

    move-result-object v3

    sget-object v4, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;->UNIFI_CLOUD_CONSOLE:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v4, p0, LOd/c$e$f;->a:LOd/c;

    invoke-static {v4, v3}, LOd/c;->c(LOd/c;Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;)LOd/a$b;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->e()Ljava/util/Map;

    move-result-object p1

    sget-object v4, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;->UNIFI_REMOTE_ACCESS:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;->b()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, LOd/c$e$f;->a:LOd/c;

    invoke-static {v1, p1}, LOd/c;->c(LOd/c;Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;)LOd/a$b;

    move-result-object v1

    :cond_3
    new-instance p1, LOd/c$b;

    invoke-direct {p1, v3, v1, v0, v2}, LOd/c$b;-><init>(LOd/a$b;LOd/a$b;LOd/a$b;LOd/a$b;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;

    invoke-virtual {p0, p1}, LOd/c$e$f;->a(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)LOd/a;

    move-result-object p1

    return-object p1
.end method
