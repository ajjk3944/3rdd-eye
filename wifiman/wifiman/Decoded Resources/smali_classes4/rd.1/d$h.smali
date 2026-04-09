.class final Lrd/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/d;->f()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/d;


# direct methods
.method constructor <init>(Lrd/d;)V
    .locals 0

    iput-object p1, p0, Lrd/d$h;->a:Lrd/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentHashMap;)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lrd/d$h;->a:Lrd/d;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    invoke-static {v0, v2}, Lrd/d;->c(Lrd/d;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)Lrd/b$a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Lrd/d$h$a;

    invoke-direct {v0}, Lrd/d$h$a;-><init>()V

    invoke-static {p1, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1}, Lrd/d$h;->a(Ljava/util/concurrent/ConcurrentHashMap;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
