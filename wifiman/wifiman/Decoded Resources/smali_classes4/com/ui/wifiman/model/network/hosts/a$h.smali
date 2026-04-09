.class final Lcom/ui/wifiman/model/network/hosts/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a;-><init>(LRb/a;Ldd/a;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/network/hosts/a$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$h;

    invoke-direct {v0}, Lcom/ui/wifiman/model/network/hosts/a$h;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$h;->a:Lcom/ui/wifiman/model/network/hosts/a$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 11

    const-string v0, "sortedHosts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stats"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v7, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v9, v7, 0x1

    if-gez v7, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v1, LRb/c;

    invoke-virtual {v1}, LRb/c;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "gateway"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v1}, LRb/c;->d()J

    move-result-wide v4

    invoke-virtual {v1}, LRb/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ldd/i;

    invoke-virtual {v1}, LRb/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldd/i;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ldd/i;->g()Linet/ipaddr/g;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    new-instance v10, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;

    move-object v2, v10

    move-wide v3, v4

    move-object v5, v1

    move v6, v7

    move-object v7, v8

    invoke-direct/range {v2 .. v7}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;-><init>(JLinet/ipaddr/g;ILdd/i;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v1}, LRb/c;->d()J

    move-result-wide v4

    invoke-virtual {v1}, LRb/c;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, LRb/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ldd/i;

    invoke-virtual {v1}, LRb/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldd/i;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ldd/i;->g()Linet/ipaddr/g;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v3

    :goto_2
    new-instance v10, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;

    move-object v2, v10

    move-wide v3, v4

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;-><init>(JLinet/ipaddr/g;Ljava/lang/String;ILdd/i;)V

    :goto_3
    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v7, v9

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/network/hosts/a$h;->a(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
