.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;->a(Lcom/ui/wifiman/model/vendor/d$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/HashMap;Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;)Ljava/util/HashMap;
    .locals 3

    const-string v0, "serviceMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "service"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->b()Linet/ipaddr/g;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    monitor-enter v2

    :try_start_1
    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    return-object p1

    :catchall_1
    move-exception p1

    monitor-exit v2

    throw p1

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/HashMap;

    check-cast p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b$a;->a(Ljava/util/HashMap;Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1
.end method
