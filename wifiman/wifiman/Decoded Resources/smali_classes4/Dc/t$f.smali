.class final LDc/t$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/t;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LDc/t;


# direct methods
.method constructor <init>(LDc/t;)V
    .locals 0

    iput-object p1, p0, LDc/t$f;->a:LDc/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Linet/ipaddr/g;LDc/t;)V
    .locals 0

    invoke-static {p0, p1}, LDc/t$f;->c(Linet/ipaddr/g;LDc/t;)V

    return-void
.end method

.method private static final c(Linet/ipaddr/g;LDc/t;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stream["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "] Finished"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, LDc/t;->i()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, LDc/t$f;->b(Ljava/util/Set;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Set;)LDj/a;
    .locals 6

    const-string v0, "allDiscoveredIpAddresses"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDc/t$f;->a:LDc/t;

    invoke-static {v0}, LDc/t;->e(LDc/t;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LDc/t$f;->a:LDc/t;

    monitor-enter v0

    :try_start_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Linet/ipaddr/g;

    invoke-static {v1, v3}, LDc/t;->g(LDc/t;Linet/ipaddr/g;)Lgg/z;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v5, LDc/t$f$b;

    invoke-direct {v5, v3, v1}, LDc/t$f$b;-><init>(Linet/ipaddr/g;LDc/t;)V

    invoke-virtual {v4, v5}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v5, LDc/u;

    invoke-direct {v5, v3, v1}, LDc/u;-><init>(Linet/ipaddr/g;LDc/t;)V

    invoke-virtual {v4, v5}, Lgg/z;->l(Lkg/a;)Lgg/z;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LDc/t;->k()Lgg/y;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v1}, LDc/t;->k()Lgg/y;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    monitor-exit v0

    iget-object p1, p0, LDc/t$f;->a:LDc/t;

    invoke-static {p1, v2}, LDc/t;->f(LDc/t;Ljava/util/Collection;)Lgg/i;

    move-result-object p1

    sget-object v0, LDc/t$f$a;->a:LDc/t$f$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1

    :goto_2
    monitor-exit v0

    throw p1
.end method
