.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;


# instance fields
.field private final b:Ljava/util/Map;

.field private final c:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;

    invoke-interface {v3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/d;->b:Ljava/util/Map;

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/d;->c:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
    .locals 1

    const-string v0, "serviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "txt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;->a(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/d;->c:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;

    invoke-interface {p1, p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$n;->a(Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object p1

    if-eqz p1, :cond_2

    :cond_1
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fallback bonjour service parser should always return non null value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
