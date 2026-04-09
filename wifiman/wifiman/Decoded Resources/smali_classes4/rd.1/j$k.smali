.class final Lrd/j$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;->r(Linet/ipaddr/g;I)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/j;

.field final synthetic b:I

.field final synthetic c:Linet/ipaddr/g;


# direct methods
.method constructor <init>(Lrd/j;ILinet/ipaddr/g;)V
    .locals 0

    iput-object p1, p0, Lrd/j$k;->a:Lrd/j;

    iput p2, p0, Lrd/j$k;->b:I

    iput-object p3, p0, Lrd/j$k;->c:Linet/ipaddr/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/f;
    .locals 8

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrd/j$k;->a:Lrd/j;

    invoke-static {v0}, Lrd/j;->e(Lrd/j;)Lmc/a;

    move-result-object v0

    invoke-interface {v0}, Lmc/a;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lrd/j$k;->a:Lrd/j;

    invoke-static {v0}, Lrd/j;->e(Lrd/j;)Lmc/a;

    move-result-object v0

    invoke-interface {v0}, Lmc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    iget-object v1, p0, Lrd/j$k;->a:Lrd/j;

    invoke-static {v1}, Lrd/j;->e(Lrd/j;)Lmc/a;

    move-result-object v1

    invoke-interface {v1}, Lmc/a;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v2, v0

    iget-object v0, p0, Lrd/j$k;->a:Lrd/j;

    invoke-static {v0}, Lrd/j;->e(Lrd/j;)Lmc/a;

    move-result-object v0

    invoke-interface {v0}, Lmc/a;->d()LCc/b;

    move-result-object v0

    instance-of v0, v0, LCc/b$a$b;

    if-eqz v0, :cond_1

    sget-object v0, Lrd/b$a$a;->TABLET_ANDROID:Lrd/b$a$a;

    goto :goto_0

    :cond_1
    sget-object v0, Lrd/b$a$a;->PHONE_ANDROID:Lrd/b$a$a;

    :goto_0
    invoke-static {v0}, Lrd/f;->b(Lrd/b$a$a;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrd/j$k;->c:Linet/ipaddr/g;

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v1}, Linet/ipaddr/g;->p1()Ljava/net/InetAddress;

    move-result-object v1

    instance-of v4, v1, Ljava/net/Inet4Address;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    check-cast v1, Ljava/net/Inet4Address;

    goto :goto_1

    :cond_2
    move-object v1, v5

    :goto_1
    if-eqz v1, :cond_3

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v3}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v6

    iget-object v1, p0, Lrd/j$k;->c:Linet/ipaddr/g;

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v1}, Linet/ipaddr/g;->p1()Ljava/net/InetAddress;

    move-result-object v1

    instance-of v4, v1, Ljava/net/Inet6Address;

    if-eqz v4, :cond_4

    move-object v5, v1

    check-cast v5, Ljava/net/Inet6Address;

    :cond_4
    if-eqz v5, :cond_5

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v3}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v7

    iget-object v1, p0, Lrd/j$k;->a:Lrd/j;

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v3

    const-string v4, "name"

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lrd/j;->e(Lrd/j;)Lmc/a;

    move-result-object v4

    invoke-interface {v4}, Lmc/a;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "model"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "type"

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lrd/j;->h(Lrd/j;)Ldc/a;

    move-result-object v0

    invoke-virtual {v0}, Ldc/a;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "version"

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "id"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    new-instance p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    const-string v3, "_wifiman-local-speedtest._tcp"

    iget v0, p0, Lrd/j$k;->b:I

    move-object v1, p1

    move-object v5, v6

    move-object v6, v7

    move v7, v0

    invoke-direct/range {v1 .. v7}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;I)V

    iget-object v0, p0, Lrd/j$k;->a:Lrd/j;

    invoke-static {v0}, Lrd/j;->g(Lrd/j;)Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;->c(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lrd/j$k;->a(Ljava/lang/String;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
