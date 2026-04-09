.class public final Led/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/b;->b()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Led/b;


# direct methods
.method public constructor <init>(Led/b;)V
    .locals 0

    iput-object p1, p0, Led/b$a;->a:Led/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Led/b$a;->a:Led/b;

    invoke-static {v0}, Led/b;->a(Led/b;)Lcom/ubnt/net/arp/NetlinkArpTable;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/net/arp/NetlinkArpTable;->getArpTable()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v4, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v4, v2}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v2

    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    new-instance v4, Led/a$a;

    invoke-direct {v4, v3, v2}, Led/a$a;-><init>(Ljava/lang/String;Lh9/a;)V

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    :cond_2
    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
