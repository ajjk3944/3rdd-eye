.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->v(Ljava/util/List;Ljava/util/List;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 9

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v2

    sget-object v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$r;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$r;

    invoke-static {v2, v3}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    invoke-static {v2}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->b:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v3

    sget-object v4, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$s;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$s;

    invoke-static {v3, v4}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    invoke-static {v3}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->b:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-static {v6, v5}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->q(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)LLb/a;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_2

    invoke-static {}, LZg/v;->v()V

    :cond_2
    check-cast v6, LNa/b;

    invoke-virtual {v6}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    iget-object v8, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    if-nez v5, :cond_3

    iget-object v5, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->b:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v4

    :goto_2
    invoke-static {v8, v6, v5}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->p(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;LNa/b;Z)LLb/a;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    move v5, v7

    goto :goto_1

    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$q;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->g(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)LLb/b;

    move-result-object v2

    invoke-interface {v2, v1, v0}, LLb/b;->e(Ljava/util/List;Ljava/util/List;)Z

    :cond_7
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_4
    return-void
.end method
