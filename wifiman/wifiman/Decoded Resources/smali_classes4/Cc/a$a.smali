.class public abstract LCc/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LCc/a;)LCc/b;
    .locals 1

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->d()LCc/b;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lwc/a;->n()LCc/b;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static b(LCc/a;)Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-interface {p0}, LCc/a;->g()Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/bluetooth/le/a$a;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static c(LCc/a;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LDc/j;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static d(LCc/a;)Ljava/util/Set;
    .locals 3

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LDc/j;->q()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lwc/a;->b()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_3

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ui/wifiman/model/bluetooth/le/j;

    instance-of v2, v2, Lyc/r;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/ui/wifiman/model/bluetooth/le/j;

    if-eqz v1, :cond_3

    check-cast v1, Lyc/r;

    invoke-virtual {v1}, Lyc/r;->a()Linet/ipaddr/g;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {v1}, Lyc/r;->a()Linet/ipaddr/g;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method

.method public static e(LCc/a;)Linet/ipaddr/ipv4/b;
    .locals 0

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LDc/j;->n()Linet/ipaddr/ipv4/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static f(LCc/a;)Linet/ipaddr/ipv6/b;
    .locals 0

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LDc/j;->i()Linet/ipaddr/ipv6/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static g(LCc/a;)Lh9/a;
    .locals 1

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->l()Lh9/a;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_0
    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lwc/a;->h()Lh9/a;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LCc/a;->m()Ljava/util/TreeSet;

    move-result-object p0

    invoke-static {p0}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lle/i;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lle/i;->e()Lh9/a;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static h(LCc/a;)Ljava/util/Set;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LDc/j;->k()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lwc/a;->h()Lh9/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lwc/a;->d()Lh9/a;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method public static i(LCc/a;)Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_0
    invoke-interface {p0}, LCc/a;->f()Lxa/a$d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lua/a;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LCc/a;->g()Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/bluetooth/le/a$a;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static j(LCc/a;)Ljava/lang/String;
    .locals 2

    invoke-interface {p0}, LCc/a;->getConfig()LCc/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LCc/l;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_0
    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LDc/j;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lwc/a;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_4

    invoke-interface {p0}, LCc/a;->g()Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/ui/wifiman/model/bluetooth/le/a$a;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :cond_4
    :goto_2
    return-object v0
.end method

.method public static k(LCc/a;)Lxa/a$d;
    .locals 1

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->f()Lxa/a$d;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lwc/a;->j()Lxa/a$d;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static l(LCc/a;)Ljava/lang/Long;
    .locals 3

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->e()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_0
    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lwc/a;->b()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_4

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/bluetooth/le/j;

    instance-of v2, v1, Lyc/r;

    if-eqz v2, :cond_2

    check-cast v1, Lyc/r;

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lyc/r;->c()Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    move-object v0, v1

    :cond_4
    return-object v0
.end method

.method public static m(LCc/a;)Lcom/ui/wifiman/model/vendor/d;
    .locals 2

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_0
    invoke-interface {p0}, LCc/a;->m()Ljava/util/TreeSet;

    move-result-object v0

    invoke-static {v0}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lle/i;->u()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lwc/a;->o()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_4

    invoke-interface {p0}, LCc/a;->g()Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/ui/wifiman/model/bluetooth/le/a$a;->f()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :cond_4
    :goto_2
    return-object v0
.end method
