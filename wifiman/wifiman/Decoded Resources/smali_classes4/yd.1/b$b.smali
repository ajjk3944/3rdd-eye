.class final Lyd/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->k(Lqd/d;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lqd/d;


# direct methods
.method constructor <init>(Lqd/d;)V
    .locals 0

    iput-object p1, p0, Lyd/b$b;->a:Lqd/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lcom/ui/wifiman/model/speedtest/result/b$b$a;
    .locals 11

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lyd/b$b;->a:Lqd/d;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LDc/j;

    invoke-virtual {v3}, LDc/j;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lqd/d;->o()Lqd/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lqd/a$a;->a()Linet/ipaddr/g;

    move-result-object v4

    invoke-virtual {v4}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LDc/j;

    iget-object p1, p0, Lyd/b$b;->a:Lqd/d;

    invoke-virtual {p1}, Lqd/d;->o()Lqd/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lqd/a$a;->a()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v4

    const-string p1, "toString(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LDc/j;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, p1

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p1, p0, Lyd/b$b;->a:Lqd/d;

    invoke-virtual {p1}, Lqd/d;->o()Lqd/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lqd/a$a;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :goto_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, LDc/j;->b()Ljava/lang/String;

    move-result-object p1

    move-object v8, p1

    goto :goto_4

    :cond_4
    move-object v8, v2

    :goto_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, LDc/j;->L()LTc/a$a;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, LTc/a$a;->j()Ljava/lang/String;

    move-result-object p1

    move-object v6, p1

    goto :goto_5

    :cond_5
    move-object v6, v2

    :goto_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, LDc/j;->N()LS8/g;

    move-result-object p1

    move-object v9, p1

    goto :goto_6

    :cond_6
    move-object v9, v2

    :goto_6
    if-eqz v1, :cond_7

    invoke-virtual {v1}, LDc/j;->K()LRc/a$a;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, LRc/a$a;->k()Lrd/b$a$a;

    move-result-object p1

    move-object v10, p1

    goto :goto_7

    :cond_7
    move-object v10, v2

    :goto_7
    if-eqz v1, :cond_8

    invoke-virtual {v1}, LDc/j;->f()Lxa/a$d;

    move-result-object v2

    :cond_8
    move-object v7, v2

    new-instance p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;LS8/g;Lrd/b$a$a;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lyd/b$b;->a(Ljava/util/Map;)Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    move-result-object p1

    return-object p1
.end method
