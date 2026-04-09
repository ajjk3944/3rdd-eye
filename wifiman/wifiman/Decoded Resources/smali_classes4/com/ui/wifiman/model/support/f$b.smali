.class public final Lcom/ui/wifiman/model/support/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/support/f;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/support/f;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/support/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/support/f$b;->a:Lcom/ui/wifiman/model/support/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/support/f$b;->a:Lcom/ui/wifiman/model/support/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/support/f;->i(Lcom/ui/wifiman/model/support/f;)Lcom/ui/wifiman/support/UiSupport;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/support/f$b;->a:Lcom/ui/wifiman/model/support/f;

    invoke-static {v1}, Lcom/ui/wifiman/model/support/f;->e(Lcom/ui/wifiman/model/support/f;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/support/f$b;->a:Lcom/ui/wifiman/model/support/f;

    invoke-static {v2}, Lcom/ui/wifiman/model/support/f;->h(Lcom/ui/wifiman/model/support/f;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ui/wifiman/model/support/f$b;->a:Lcom/ui/wifiman/model/support/f;

    invoke-static {v3}, Lcom/ui/wifiman/model/support/f;->g(Lcom/ui/wifiman/model/support/f;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/support/a$a;

    iget-object v6, p0, Lcom/ui/wifiman/model/support/f$b;->a:Lcom/ui/wifiman/model/support/f;

    invoke-static {v6, v5}, Lcom/ui/wifiman/model/support/f;->d(Lcom/ui/wifiman/model/support/f;Lcom/ui/wifiman/model/support/a$a;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/ui/wifiman/model/support/f$d;

    invoke-direct {v3}, Lcom/ui/wifiman/model/support/f$d;-><init>()V

    invoke-static {v4, v3}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/ui/wifiman/support/UiSupport;->e(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
