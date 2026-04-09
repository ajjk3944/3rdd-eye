.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->h(Ljava/lang/String;)Lgg/i;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$c;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;Lgd/a$a;)Ll9/a;
    .locals 12

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceLookupDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v6

    if-eqz v6, :cond_3

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$c;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->c()I

    move-result v7

    new-instance v10, Ljava/util/TreeMap;

    invoke-direct {v10}, Ljava/util/TreeMap;-><init>()V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "_"

    invoke-static {v1, v2}, Lkotlin/text/t;->G0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v5, 0x0

    move v8, v5

    :goto_0
    if-ge v8, v2, :cond_1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v11, 0x2e

    if-eq v9, v11, :cond_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "substring(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v5, v1

    invoke-static {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->e(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;->a(Ljava/lang/String;Ljava/util/Map;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v8

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->c()I

    move-result p1

    invoke-interface {p2, p1}, Lgd/a$a;->a(I)Lgd/a;

    move-result-object v9

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    move-object v2, v1

    invoke-direct/range {v2 .. v10}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Linet/ipaddr/g;ILcom/ui/wifiman/model/discovery/engine/bonjour/c;Lgd/a;Ljava/util/TreeMap;)V

    goto :goto_1

    :cond_2
    instance-of p2, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;

    if-eqz p2, :cond_4

    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->e()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Service "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " LOST"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "BonjourDiscoveryEngine"

    invoke-static {p1, p2}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;

    check-cast p2, Lgd/a$a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$c;->a(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;Lgd/a$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
